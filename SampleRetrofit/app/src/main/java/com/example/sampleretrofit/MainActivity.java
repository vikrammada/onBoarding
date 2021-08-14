package com.example.sampleretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textviewresult;
    JavaPlaceHolder javaPlaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviewresult = findViewById(R.id.text_view_result);
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        javaPlaceHolder = retrofit.create(JavaPlaceHolder.class);
        //getPosts();
        //createPost();
        updatePost();

    }

    private void updatePost() {
        Post post=new Post(34,"updating","new updated text");
        Call<Post> call = javaPlaceHolder.patchPost(5,post);
        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(!response.isSuccessful()){
                    textviewresult.setText("code:" + response.code());
                }
                Post postResponse = response.body();
                String content = "";
                content += "code:"+response.code() +"\n";
                content += "id: "+postResponse.getId()+"\n";
                content += "userId: "+postResponse.getUserId()+"\n";
                content +="title: "+postResponse.getTitle()+"\n";
                content += "text:" +postResponse.getText()+"\n\n";
                textviewresult.append(content);

            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                textviewresult.setText(t.getMessage());

            }
        });
    }

    private void getPosts(){
        Call<List<Post>> call=javaPlaceHolder.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {

                if(!response.isSuccessful()) {
                    textviewresult.setText("code:" + response.code());
                    return;
                }
                    List<Post> posts=response.body();
                    for(Post post:posts) {
                        String content = "";
                        content += "ID: " + post.getId() + "\n";
                        content += "UserID: " + post.getUserId() + "\n";
                        content += "Title: " + post.getTitle() + "\n";
                        content += "Body: " + post.getText() + "\n\n";
                        textviewresult.append(content);
                    }

                      }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

                textviewresult.setText(t.getMessage());
            }
        });
        }

        private void createPost(){
        Post post=new Post(12,"new data","this is new text");
        Call<Post> call=javaPlaceHolder.createPost(post);
        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(!response.isSuccessful()) {
                    textviewresult.setText("code:" + response.code());
                    return;
                }
                Post postResponse =response.body();
                    String content = "";
                    content +="code" +response.code() +"\n";
                    content += "ID: " + postResponse.getId() + "\n";
                    content += "UserID: " + postResponse.getUserId() + "\n";
                    content += "Title: " + postResponse.getTitle() + "\n";
                    content += "Body: " + postResponse.getText() + "\n\n";
                    textviewresult.append(content);


            }


            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                textviewresult.setText(t.getMessage());

            }
        });
        }
    }


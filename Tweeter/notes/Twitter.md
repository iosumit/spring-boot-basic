### Feature 
Authentication ---
Tweets ----
Like ---
Follow/Following 


Request  |    GET        |     POST    |          PUT      |          DELETE 
-------|-----|----|
body    |      x         |      Y         |        Y        |           x
             List             Create           update              delete
Response     Data    


## Requirements:
1. `User registration`: Users should be able to create accounts with unique usernames and passwords.

``` shell
- POST "/user/login" 
      body -  {username:"xyz@gm.com", password:"1111" }
      response -  { 
        message: "Successfully login", username:"xyz@gm.com" ,
        user_id:"111",
        token:"dkmekmdekmdkmed"
        }
```
    
``` shell
    - POST "/user/signup" 
      body - {
            username:"xyz@gm.com", 
            password:"1111" 
            name:"XYZ"
            email:"XYZ@gmail.com"
        }
    - Response - { 
        message: "Successfully registered", username:"xyz@gm.com",
        user_id:"111",
        token:"dkmekmdekmdkmed"
    }
```
---

3. `Tweeting`: Users should be able to send tweets (messages up to 280 characters) that can be seen by their followers.
``` shell
- POST "/tweet/create" -
        body - {
            caption: "Hi this is my tweet",
            user_id: "11111"
        } 
        Response -  { message: "Successfully posted" }
```
``` Shell
- PUT "/tweet/update" -
        body - {
            caption: "Hi this is my update tweet",
            user_id: "111",
            tweet_id:"122"
        } 
        Response -  { message: "Successfully posted" }

```
``` Shell
- DELETE "/tweet/delete/tweet_id" -
    Response -  { message: "Successfully posted" }
```
``` Shell
- GET "/tweet/lists/user_id" -
    Response -  { message: "Successfully fetched",
    list:[
        {caption:"", created_at:"", user_id:""},
        {caption:"", created_at:"", user_id:""},
        {caption:"", created_at:"", user_id:""},
        {caption:"", created_at:"", user_id:""}
    ]
     }
```


4. Timeline: Users should be able to see their own tweets and tweets of others they follow in their timeline.
    - timeline_api --- user_id, tweet_id ---- {message:"You are seeing user_id, tweet_id" list:[{}, {}, {}]}


5. Likes: Users should be able to like tweets and see the tweets they have liked

2. Following: Users should be able to follow other users, and see the tweets of the users they follow in their timeline.
Expectations:
- All actions should be performed after authentication and authorisation, should have token-based authentication
- Create APIs for signup, login, search users, follow/unfollow users, sending tweet, delete tweet, like tweet, unlike
Iliked tweet
- Come up with database table design
1- Add Checkstyle for code analysis - SonarQube with 0% of critical issues
- Write Junit testcases for all the features, use mockito for mocking b objects - 70% of coverage





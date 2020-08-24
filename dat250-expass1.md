
# Report of heroku installation

1. Installed
    * heroku cli
    * java jdk
    * apache maven

1. Followed [this](https://devcenter.heroku.com/articles/getting-started-with-java) tutorial

1. Confirmed that the tutorial deployment works when the heroku client ouputs 

    ```text
    remote:        [INFO] ------------------------------------------------------------------------
    remote:        [INFO] BUILD SUCCESS
    remote:        [INFO] ------------------------------------------------------------------------
    remote:        [INFO] Total time:  14.786 s
    remote:        [INFO] Finished at: 2020-08-24T13:48:43Z
    remote:        [INFO] ------------------------------------------------------------------------
    remote: -----> Discovering process types
    remote:        Procfile declares types -> web
    remote: 
    remote: -----> Compressing...
    remote:        Done: 71.4M
    remote: -----> Launching...
    remote:        Released v5
    remote:        https://secret-stream-07028.herokuapp.com/ deployed to Heroku
    remote: 
    remote: Verifying deploy... done.
    To https://git.heroku.com/secret-stream-07028.git
    ```

1. Visiting the [URL](https://secret-stream-07028.herokuapp.com/) shows the java turorial sample app, which confirms successful installation.

# Errors

None

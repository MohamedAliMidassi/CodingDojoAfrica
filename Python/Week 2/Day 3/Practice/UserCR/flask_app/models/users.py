# import the function that will return an instance of a connection
from flask_app.config.mysqlconnection import connectToMySQL

DATABASE = "userscr_schema"

# === C R U D ===


# model the class after the friend table from our database
class users:
    def __init__(self, data):
        self.id = data["id"]
        self.first_name = data["first_name"]
        self.last_name = data["last_name"]
        self.email = data["email"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]

    #! all queries are classmethods

    # * =========== READ ALL ===========
    @classmethod
    def getusers(cls):
        querry ="select * from users;"
        result=connectToMySQL(DATABASE).query_db(querry)
        user_dict=[]
        if result:
            for each_user in result:
                user=cls(each_user)
                user_dict.append(user)
            return user_dict
        return []


    @classmethod
    def newuser(cls,data):
        querry="INSERT INTO users (first_name,last_name,email) values(%(first_name)s,%(last_name)s,%(email)s);"
        result=connectToMySQL(DATABASE).query_db(querry,data)
        return result
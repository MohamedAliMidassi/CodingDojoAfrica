
from flask_app.config.mysqlconnection import connectToMySQL

DATABASE = "userscr_schema"

class users:
    def __init__(self, data):
        self.id = data["id"]
        self.first_name = data["first_name"]
        self.last_name = data["last_name"]
        self.email = data["email"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]

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
        
    @classmethod
    def newuser(cls,data):
        querry="INSERT INTO users (first_name,last_name,email) values(%(first_name)s,%(last_name)s,%(email)s);"
        result=connectToMySQL(DATABASE).query_db(querry,data)
        return result
    
    @classmethod
    def get_one(cls,data):
        query  = "SELECT * FROM users WHERE id = %(id)s;"
        result = connectToMySQL(DATABASE).query_db(query,data)
        print(result,"============")
        return cls(result[0])
    
    @classmethod
    def update(cls,data):
        query = "UPDATE users SET first_name=%(first_name)s,last_name=%(last_name)s,email=%(email)s,updated_at=NOW() WHERE id = %(id)s;"
        return connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod
    def destroy(cls,data):
        query  = "DELETE FROM users WHERE id = %(id)s;"
        return connectToMySQL(DATABASE).query_db(query,data)
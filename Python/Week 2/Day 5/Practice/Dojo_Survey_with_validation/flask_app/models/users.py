from flask_app.config.mysqlconnection import connectToMySQL
from flask import flash,request
DATABASE="dojo_survey_schema"



class user:
    def __init__(self, data) :
        self.id = data["id"]
        self.name = data["name"]
        self.location = data["location"]
        self.language = data["language"]
        self.comment = data["comment"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]

    @staticmethod
    def validate_user(data):
        is_valid = True

        if len(data['name']) < 1:
            is_valid = False
            flash("name is required !", "survey")

        if len(data["location"]) < 1:
            is_valid = False
            flash("location is required !", "survey")

        if len(data["language"]) < 1:
            is_valid = False
            flash("language is required !","survey")
        
        if len(data["comment"]) < 1:
            is_valid = False
            flash("comment is required", "survey")


        return is_valid

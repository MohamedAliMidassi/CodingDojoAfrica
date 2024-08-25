from flask_app.configs import mysqlconnection
from flask import flash,request
import re
EMAIL_REGEX = re.compile(r"^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$")

class user:
    def __init__(self,data):
        self.id=data['id']
        self.email=data['email']
        self.created_at=data['created_at']
        self.updated_at=data['updated_at']
    @classmethod
    def valid(cls,data):
        is_valid = True
        if len(data["email"]) < 1:
            is_valid = False
            flash("email is required !")
        elif not EMAIL_REGEX.match(data["email"]):
            flash("Invalid email address!", "email")
            is_valid = False
        else:
            flash("the email you  entenred is valid")
        return is_valid
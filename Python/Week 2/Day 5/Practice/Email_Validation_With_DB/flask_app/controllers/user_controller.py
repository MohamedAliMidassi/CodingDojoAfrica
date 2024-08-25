from flask_app import app
from flask_app.models.users import user
from flask import render_template,redirect,request


@app.route('/all')
def show_all():
    return render_template("allgmails.html")


#? view route
@app.route('/')
def display():
    
    return render_template("home.html")


#! action route
@app.route("/verify", methods=["POST"])
def emailvalid():
    print("=========================================",request.form["name"])
    if not user.valid(request.form["name"]):
        return redirect("/")
    return redirect("/all")
from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.users import users

@app.route('/')
def home():
    all_users=users.getusers()
    return render_template('alluseres.html',all_users=all_users)

@app.route('/new')
def newuser():
    return render_template('addusers.html')

@app.post('/add')
def add():
    users.newuser(request.form)
    return redirect('/')


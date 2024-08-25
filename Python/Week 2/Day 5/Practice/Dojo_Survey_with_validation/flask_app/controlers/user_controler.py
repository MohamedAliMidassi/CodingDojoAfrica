from flask_app import app
from flask_app.models.users import user
from flask import render_template,redirect,session,request

@app.route('/')
def submit():
    return render_template('index.html')

@app.route('/', methods=['POST'])
def create_dojo():
    if not user.validate_user(request.form):
        return redirect("/")
    session['name'] = request.form['name']
    session['location'] = request.form['location']
    session['language'] = request.form['language']
    session['comment'] = request.form['comment']
    return redirect('/result')

@app.route('/result')
def show_dojos():
    return render_template('result.html', name=session['name'], location=session['location'], favorite_language=session['language'], comment = session['comment'])
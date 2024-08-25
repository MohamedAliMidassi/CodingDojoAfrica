from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.dojos import dojos
from flask_app.models.ninjas  import ninjas

@app.route('/')
def index():
    all_dojos=dojos.getall()
    return render_template("alldojos.html", all_dojos = all_dojos)

@app.route('/create/dojo', methods =['POST'])
def create_dojos():
    data = {
        "name" : request.form['name']
    }
    dojos.save(data)
    return redirect('/')

@app.route('/dojos/<int:id>')
def details(id):
    data= {
        "id":id
    }
    dojo=dojos.get_one_by_id(data)
    ninja=ninjas.get_by_dojo_id(data)
    return render_template('dojo.html',dojo=dojo,ninja=ninja)


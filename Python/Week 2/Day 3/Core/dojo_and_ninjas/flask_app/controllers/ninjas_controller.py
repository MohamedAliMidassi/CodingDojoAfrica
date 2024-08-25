from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.dojos import dojos
from flask_app.models.ninjas import ninjas


@app.route('/new_ninja')
def ninjas():
    alldojos=dojos.getall()
    return render_template("addninja.html", alldojos=alldojos)

@app.route('/create/ninja', methods=['POST'])
def create_ninja():
    data = {
        "first_name": request.form['fname'],
        "last_name": request.form['lname'],
        "age": request.form['age'],
        "dojo_id": request.form.get('dojo_id')  # Add the selected dojo ID to the data
    }
    ninjas.save(data)
    return redirect('/dojo')
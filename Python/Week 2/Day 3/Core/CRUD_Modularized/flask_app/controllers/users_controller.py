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

@app.route('/user/edit/<int:id>')
def edit(id):
    data ={ 
        "id":id
    }
    user=users.get_one(data)
    return render_template("editusers.html",user=user)

@app.route('/user/show/<int:id>')
def show(id):
    data ={ 
        "id":id
    }
    user=users.get_one(data)
    print("======",user)
    return render_template("showuser.html",user=user)


@app.route('/user/update',methods=['POST'])
def update():
    users.update(request.form)
    return redirect('/')

@app.route('/user/destroy/<int:id>')
def destroy(id):
    data ={
        'id': id
    }
    users.destroy(data)
    return redirect('/')


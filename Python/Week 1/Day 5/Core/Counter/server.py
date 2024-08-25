from flask import Flask,render_template,redirect,session,request
app=Flask(__name__)
app.secret_key = 'keep it secret, keep it safe' 
@app.route('/')
def hello():
    if "num" not in session:
        session['num'] =1
    else:
        session['num']+=1
    return render_template("index.html") 
@app.route('/home' , methods=['post'])
def home():
    
    return redirect('/')

@app.route('/destroy_session' , methods=['post'])
def destroy():
    session.pop('num')
    return redirect('/')
@app.route('/plus2' , methods=['post'])
def plus2():
    session['num']+=1
    return redirect('/')

if __name__=="__main__":
    app.run(debug=True)
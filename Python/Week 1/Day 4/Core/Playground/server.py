from flask import Flask,render_template

app=Flask(__name__)
@app.route('/')
def hello():
    return "hello "

@app.route('/play')
def play():
    return render_template('index.html')
@app.route('/play2/<int:num>')
def play2(num):
    return render_template('index2.html',num=num)
@app.route('/play3/<int:num>/<color>')
def play3(num,color):
    return render_template('index3.html',num=num,color=color)
if __name__=="__main__":
    app.run(debug=True)
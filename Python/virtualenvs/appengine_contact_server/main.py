from flask import Flask
app = Flask(__name__)

@app.route("/")
def hello():
    return "Test from my home PC"

if __name__ == "__main__":
    app.run()
x = [ [5,2,3], [15,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Bryant', 'James', 'Curry'],
    'soccer' : ['Messi', 'Andres', 'Rooney']
}
z = [ {'x': 10, 'y': 30} ]

students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
def iterateDictionary(students):
    for key,value in students:
        print(key,"-",students[key])
iterateDictionary(students)
# should output: (it's okay if each key-value pair ends up on 2 separate lines;
# bonus to get them to appear exactly as below!)
#first_name - Michael, last_name - Jordan
#first_name - John, last_name - Rosales
#first_name - Mark, last_name - Guillen
#first_name - KB, last_name - Tonel

def iterateDictionary2(key,list):
    for i in list:
        print(i[key])
iterateDictionary2('first_name',students) 
iterateDictionary2('last_name',students)
dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
def printInfo2(some_dict):
    for i in some_dict:
        print(len(some_dict))
printInfo2(dojo['locations'])

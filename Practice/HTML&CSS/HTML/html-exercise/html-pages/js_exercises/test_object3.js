// create object with new keyword
// created constructor function
function Person(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
}
// create new object with new
var myFather = new Person("Jon", "Doe", 50, "blue");
var myMother = new Person("Julie", "Doe", 45, "green");

// add properties seperatley 
myFather.birthday = "may 15th"
myMother.birthday = "june 8th"

console.log(myMother)

myFather.hobby = "golf"
myFather.drive = function() {
    return 1;
}

console.log(myFather.drive())
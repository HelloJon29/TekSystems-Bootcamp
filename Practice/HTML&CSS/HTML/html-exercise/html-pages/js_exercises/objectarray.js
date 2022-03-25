var person = {name:"John", age:30, city:"New York", eyeColor:"blue"};
var myArray = Object.values(person);
console.log(myArray)

// for in loop
var txt = "";
var person = {fname:"John", lname:"Doe", age:25};
for (x in person) {
 	 txt += person[x]; //note: You must use person[x] in the loop. person.x will not work (Because x is a variable).
}
   console.log(txt)

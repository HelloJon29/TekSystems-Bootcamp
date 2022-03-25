// Consider “a” parent object of “b” and “c”
var a = {
x: 10,
another: "jon",
calculate: function (z) {
return this.x + this.y + z
}
};

var b = {
y: 20,
__proto__: a // set prototype to a, making a sor of a "parent" b will search for any properties or functions in a
};

var c = {
y: 30, // this will be used in whatever function is called
};
c.__proto__ = a; // set protype to a, making it sort of a "parent", so c will search for any properties or functions in a

// call the inherited method
console.log(b.calculate(30)); // 60 = 10 +20 +30
console.log(b.another); // access property from a since it doesn't exist in b
console.log(c.calculate(40)); // 80 = 10 +30 +40
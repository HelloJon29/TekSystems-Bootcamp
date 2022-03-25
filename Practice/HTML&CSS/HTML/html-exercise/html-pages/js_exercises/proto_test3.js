// this test shows that when prototype is added then all child objects will point to it immediatley 
var simpleObj = function(c) {
    this.city = c;
}

var live1 = new simpleObj("St.Paul");
var live2 = new simpleObj("St.cloud")
console.log(live2.state)

simpleObj.prototype.state = "MN";

console.log(live1.state)
console.log(live2.state)
console.log(live2.prototype === live1.prototype);

simpleObj.prototype.hobby = "golf"

console.log(live1.hobby)

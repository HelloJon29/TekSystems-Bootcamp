var person = {
    firstName: "Jon",
    lastName: "Doe",
    id: 5566,

    fullName: function() {
        return this.firstName + " " + this.lastName;
    }
}
// can create extra properties of an object outside an object
person.address = "USA";

// define a new function outside of object definition
function fullNameAndAddress(firstName, lastName, address) {
    return firstName + " " + lastName + " " + address;
}
// assigning non anonymous function, just call the function out and set it to a property of the object (making it a method)
person.fullNameAndAddressField = fullNameAndAddress;
// print out newly assigned properthy method (a property with an assigned function)
console.log(person.fullNameAndAddressField(person.firstName, person.lastName, person.address))
// print the fullname function defined within the person object
console.log(person.fullName())

// print newly added property outside of object
console.log(person.address)
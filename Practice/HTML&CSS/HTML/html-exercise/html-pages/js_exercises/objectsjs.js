var person = {
    firstName: "Jon",
    lastName: "Doe",
    id: 5566,

    fullName: function() {
        return this.firstName + " " + this.lastName;
    }
}

person.address = "USA";

person.fullNameAndAddress = function() {
    return person.fullName() + " " + person.address;
};

console.log(person.fullName())
console.log(person.address)
console.log(person.fullNameAndAddress())
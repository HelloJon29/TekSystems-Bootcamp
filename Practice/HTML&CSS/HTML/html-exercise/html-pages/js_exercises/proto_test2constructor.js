// Function constructor
function Foo(y) {
    this.y = y;
    }

    // Add property "x" to function prototype
    Foo.prototype.x = 10;

    // Add method "calculate" to function prototype
    Foo.prototype.calculate = function (z) {
    return this.x + this.y + z;
    };

    // now create our "b" and "c"
    // objects are created from “Foo”
    var b = new Foo(20); // this is y when defined leading back to original foo
    var c = new Foo(30);
    var d = new Foo(40);

    // call the inherited method
    b.calculate(30); // 60 this is z value going to calculate function
    c.calculate(40); // 80

    console.log(b.x)
// get table data by rows
let table = document.getElementById('table'), rIndex;

for(let i = 1; i < table.rows.length; i++) {
    table.rows[i].onclick = function() {
        rIndex = this.rowIndex;
        // check onclick output on rows
        console.log(rIndex);

        document.getElementById("firstName").value = this.cells[0].innerHTML;
        document.getElementById("lastName").value = this.cells[1].innerHTML;
        document.getElementById("email").value = this.cells[2].innerHTML;
    };
}

function editRow() {
    table.rows[rIndex].cells[0].innerHTML = document.getElementById('firstName').value;
    table.rows[rIndex].cells[1].innerHTML = document.getElementById('lastName').value;
    table.rows[rIndex].cells[2].innerHTML = document.getElementById('email').value;
}
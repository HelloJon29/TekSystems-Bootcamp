let element = document.getElementById("form");
let ele = document.getElementById("feedback");
if (element.addEventListener) {
    element.addEventListener("submit", main_validator, true);
}
else if (ele.attachEvent) {
    element.attachEvent('onsubmit', main_validator)
}

function main_validator(e) {
    console.log(e);
    e.preventDefault();
    ele.innerHTML = "";
    if (check_username(e.target[0].value) &&
        check_dob(e.target[1].value)
    ) {
        element.submit();
    }
}

function check_username(username) {
    let re = new RegExp(/^[a-zA-Z0-9_.-]*$[a-zA-Z_.-]*$/);
    let message = "";
    let someWrong = false;
    console.log(re.test(username));
    if (!re.test(username)) {
        message += "username can only be [a-z], [A-Z], or (-,_)";
        someWrong = true;
    }
    if (username.length > 20) {
        message += "username must be less than 20 characters";
        someWrong = true;
    }
    if (someWrong) {
        let para = document.createElement("P");
        para.classList.add("danger");
        let t = document.createTextNode(message);
        para.appendChild(t);
        ele.appendChild(para);
        return false;
    }
    return true;
}

function check_dob(dob) {
    let re = new RegExp(/^\d{4}-\d{2}-\d{2}$/);
    let message = "";
    let someWrong = false;
    if (!re.test(dob)) {
        message += "your date of birth is not in the right format";
        someWrong = true;
    }
    if (someWrong) {
        let para = document.createElement("P");
        para.classList.add("danger");
        let t = document.createTextNode(message);
        para.appendChild(t);
        ele.appendChild(para);
        return false;
    }
    return true;
}
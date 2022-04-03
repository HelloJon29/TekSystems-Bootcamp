const form = document.getElementById('form');
// const username = document.getElementById('username');
const email = document.getElementById('email');
const password = document.getElementById('password');
// const password2 = document.getElementById('password2');

form.addEventListener('submit', e => {
    e.preventDefault();
    
    validateInputs();
})

const setError = (element, message) => {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = message;
    inputControl.classList.add('error');
    inputControl.classList.remove('success');
}

const setSuccess = element => {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = '';
    inputControl.classList.add('success');
    inputControl.classList.remove('error');
};

const isValidEmail = email => {
    const reg = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    return reg.test(String(email).toLowerCase());
}

const validateInputs = () => {
    // const usernameValue = username.value.trim();
    const emailValue = email.value.trim();
    const passwordValue = password.value.trim();
    // const password2Value = password2.value.trim();

    // for username
    // if(usernameValue === '') {
    //     setError(username, 'Username cannot be blank');
    // } else {
    //     setSuccess(username);
    // }
    // for email
    if(emailValue === '') {
        setError(email, 'Email cannot be blank');
    } else if(!isValidEmail(emailValue)) {
        setError(email, 'Email is not valid');
    } else {
        setSuccess(email);
    }
    // for password 
    if(passwordValue === '') {
        setError(password, 'Password cannot be blank');
    } else if(passwordValue.length <8) {
        setError(password, 'Password must be at least 8 characters');
    } else {
        setSuccess(password);
    }
    // for password confirm
    // if(password2Value === '') {
    //     setError(password2, 'Please confirm password');
    // } else if(password2Value !== passwordValue) {
    //     setError(password2, 'Passwords does not match');
    // } else {
    //     setSuccess(password2);
    // }


}
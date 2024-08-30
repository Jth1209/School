document.getElementById('createForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const formData = new FormData(event.target);
    const jsonData = Object.fromEntries(formData.entries());//위의 두 코드는 폼 태그 내의 input에 들어간 정보(event.target)를 객체로 전환해주는 코드(Object.fromEntries())다.
    sendRequest(jsonData);
});

document.getElementById('readButton').addEventListener('click', function() {
    const jsonData = { action: 'read' };
    sendRequest(jsonData, displayReadResult);
});

document.getElementById('updateForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const formData = new FormData(event.target);
    const jsonData = Object.fromEntries(formData.entries());
    sendRequest(jsonData);
});

document.getElementById('deleteForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const formData = new FormData(event.target);
    const jsonData = Object.fromEntries(formData.entries());
    sendRequest(jsonData);
});

function sendRequest(jsonData, callback) {
    fetch('empJsonserver3.jsp', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json; charset=utf-8'
        },
        body: JSON.stringify(jsonData)
    })
    .then(response => response.json())
    .then(data => {
        if (callback) {
            callback(data);
        } else {
            alert(JSON.stringify(data));
        }
    })
    .catch(error => console.error('Error:', error));
}

function displayReadResult(data) {
    const readResultDiv = document.getElementById('readResult');
    readResultDiv.innerHTML = JSON.stringify(data, null, 2);
}
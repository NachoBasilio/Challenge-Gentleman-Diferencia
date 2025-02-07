let request = new XMLHttpRequest()

request.open("GET", "https://reqres.in/api/users", true)
request.send(null)

request.onreadystatechange = function ( state ) {
    if(request.readyState === 4){
        let resp = request.response;
        let data = JSON.parse(resp)
        console.log(data)
    }
}
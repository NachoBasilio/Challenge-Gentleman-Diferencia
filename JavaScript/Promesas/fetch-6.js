

fetch('./no-encontrado.html')
    .then(resp => {
        return resp.text()
    })
    .then(html=>{
        console.log(html)
        let body = document.querySelector('body')
        body.innerHTML = html
    })
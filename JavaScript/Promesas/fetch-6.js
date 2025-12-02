fetch('https://datatables.net')
    .then(resp => resp.text())
    .then(html => {
        console.log(html);
        document.body.innerHTML = html;
    })
    .catch(err => console.error(err));

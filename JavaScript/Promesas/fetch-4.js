let img = document.querySelector("img")

fetch('imagenejemplo.png')
.then( resp => resp.blob())
.then( image => {
    console.log(image)


    let imgPath = URL.createObjectURL(image)
    console.log(imgPath)
    img.src = imgPath
})


//Este ejercicio necesita de una image, cosa que no voy a subir a github
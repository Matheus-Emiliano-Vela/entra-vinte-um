fetch("http://localhost:8080/calcular")
    .then(res => res.text())
    .then(resultado => {
        document.getElementById("resultado").textContent = resultado;
    });
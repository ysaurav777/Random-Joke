let jokeTextEl = document.getElementById("jokeText");
let jokeBtnEl = document.getElementById("jokeBtn");
let spinnerEl = document.getElementById("spinner");

function startUp() {
    let options = {
        method: "GET",
    };

    spinnerEl.classList.remove("d-none");
    jokeTextEl.classList.add("d-none");

    fetch("https://apis.ccbp.in/jokes/random", options)
        .then(function(response) {
            return response.json();
        })
        .then(function(jsonText) {
            spinnerEl.classList.add("d-none");
            jokeTextEl.classList.remove("d-none");
            jokeTextEl.textContent = jsonText.value;
        });
}

jokeBtnEl.addEventListener("click", startUp);
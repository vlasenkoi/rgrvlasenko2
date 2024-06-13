document.addEventListener('DOMContentLoaded', function () {
    const slider = document.querySelector('.slider');
    const slides = document.querySelector('.slides');
    const prevBtn = document.querySelector('.prev');
    const nextBtn = document.querySelector('.next');

    let slideWidth = slides.querySelector('.slide').offsetWidth;
    let currentSlide = 0;

    prevBtn.addEventListener('click', function () {
        currentSlide = (currentSlide <= 0) ? slides.children.length - 1 : currentSlide - 1;
        updateSlider();
    });

    nextBtn.addEventListener('click', function () {
        currentSlide = (currentSlide >= slides.children.length - 1) ? 0 : currentSlide + 1;
        updateSlider();
    });

    function updateSlider() {
        slides.style.transform = `translateX(-${slideWidth * currentSlide}px)`;
    }
});


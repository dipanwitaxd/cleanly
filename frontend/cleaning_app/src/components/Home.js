import React from "react";
import BookingBlock from "./BookingBlock";
import Footerbody from "./Footerbody";
import FormInput from "./FormInput";
import GridView from "./GridView";
import Header from "./Header";
import HowItWorks from "./HowItWorks";
import Main from "./Main";
import Reviews from "./Reviews";

function Home() {
  return (
    <div>
      <div>
        <Header></Header>
      </div>
      <section className="slider">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-md-10">
              <div className="slider-content">
                <Main></Main>
                <FormInput></FormInput>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section className="our-client">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <span>AS SEEN ON</span>
            </div>
            <div className="col-md-12">
              <ul>
                <li>
                  <a href="#">
                    <img
                      src="./assets/images/client1.png"
                      className="img-fluid"
                      alt="client logo"
                    />
                  </a>
                </li>
                <li>
                  <a href="#">
                    <img
                      src="./assets/images/client2.png"
                      className="img-fluid"
                      alt="client logo"
                    />
                  </a>
                </li>
                <li>
                  <a href="#">
                    <img
                      src="./assets/images/client3.png"
                      className="img-fluid"
                      alt="client logo"
                    />
                  </a>
                </li>
                <li>
                  <a href="#">
                    <img
                      src="./assets/images/client4.png"
                      className="img-fluid"
                      alt="client logo"
                    />
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </section>
      <section className="howit-work main-block center-block" id="howitworks">
        <div className="container">
          <HowItWorks></HowItWorks>
        </div>
      </section>
      <section className="testimonial main-block center-block">
        <div className="container">
            <Reviews></Reviews>
        </div>
      </section>
      <section className="service-title" id="services">
        <div className="container">
            <div className="row">
                <div className="col-md-12">
                    <h2>Check out some of our <span>services!</span></h2>
                </div>
            </div>
        </div>
      </section>
      <section className="service">
          <GridView></GridView>
      </section>

      <section className="booking main-block center-block">
        <div className="container">
            <BookingBlock></BookingBlock>
        </div>
      </section>
      <footer>
        <div className="container">
            <Footerbody></Footerbody>
        </div>
      </footer>
    </div>
  );
}

export default Home;

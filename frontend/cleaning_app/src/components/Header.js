import React from 'react';
import BookingButton from './BookingButton';
import { Link } from 'react-router-dom';
import BookingDetails from './BookingDetails';

export default function Header() {
    return (
        <header>
            <div className="container">
                <div className="row">
                    <div className="col-md-12">
                        <nav className="navbar navbar-expand-lg navbar-light">
                            <a className="navbar-brand" href="#"><img src="./assets/images/logo.png" alt="logo" /></a>
                            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                                <span className="navbar-toggler-icon"></span>
                            </button>
                            <div className="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                                <ul className="navbar-nav">
                                    <li className="nav-item">
                                        <a className="nav-link" href="#howitworks">How it works</a>
                                    </li>
                                    <li className="nav-item">
                                        <a className="nav-link" href="#services">Our Services </a>
                                    </li>
                                    <li className="nav-item"><Link to="/booking"><button className="btn btn-info login">Book a Cleaning</button></Link></li>
                                    <li className="nav-item"><Link to="/mybooking"><button className="btn btn-info login" onClick={BookingDetails}>My Booking Details</button></Link></li>
                                    <li className="nav-item"><a href="booking.html" className="btn btn-info login">Sign Out</a></li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
    )
}

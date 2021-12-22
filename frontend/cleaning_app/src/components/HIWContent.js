import React from 'react'

function HIWContent() {
    return (
        <div className="row">
            <div className="col-md-4">
                <div className="howit-wrap">
                    <span className="pe-7s-date"></span>
                    <h4>Book a Cleaning</h4>
                    <p>Click the book now button to make a booking on your preffered date and time</p>
                </div>
            </div>
            <div className="col-md-4">
                <div className="howit-wrap">
                    <span className="pe-7s-lock"></span>
                    <h4>Confirm Booking</h4>
                    <p>We will confirm your booking along with your instructions via secure transaction.</p>
                </div>
            </div>
            <div className="col-md-4">
                <div className="howit-wrap">
                    <span className="pe-7s-home"></span>
                    <h4>We’ll Clean it</h4>
                    <p>Our trusted & experienced maid will come to your door-step on the time for a cleaning</p>
                </div>
            </div>
        </div>
    )
}

export default HIWContent

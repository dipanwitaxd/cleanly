import React from 'react'

function BookingContent() {
    return (
        <div className="row justify-content-center">
            <div className="col-md-10">
                <form className="form-wrap mt-5" action="booking.html">
                    <div className="btn-group" role="group" aria-label="Basic example">
                        <input type="email" placeholder="Email Address" className="btn-group1" />
                        <input type="number" placeholder="Zip Code" className="btn-group2" />
                        <button type="submit" className="btn-form">Continue<i className="pe-7s-angle-right"></i></button>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default BookingContent

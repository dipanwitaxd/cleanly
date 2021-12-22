import React from 'react'

function Form() {
    return (
            <form className="form-wrap" action="booking.html">
                <div className="btn-group" role="group" aria-label="Basic example">
                    <input type="text" placeholder="Email Address" className="btn-group1" />
                    <input type="number" placeholder="Zip Code" className="btn-group2" />
                    <button type="submit" className="btn-form">Continue<i className="pe-7s-angle-right"></i></button>
                </div>
            </form>
    )
}

export default Form

import React from 'react';

function BookingButton({text}) {
    return (
        <div>
            <button className="book_button" /*onClick={}*/>{text}</button>
        </div>
    )
}

export default BookingButton

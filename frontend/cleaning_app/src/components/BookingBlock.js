import React from 'react'
import BookingContent from './BookingContent';
import Heading from './Heading';
import SubHeading from './SubHeading';


function BookingBlock() {
    const text= "Don’t wait, Book a cleaning now.";
    const bluetext=" ";
    const subheading ="Book expert home cleaners and handymen at a moment's notice. Just pick a time and we’ll do the rest.";

    return (
        <>
            <div className="row">
                <div className="col-md-12">
                    <Heading text={text} bluetext={bluetext}></Heading>
                    <SubHeading subheading={subheading}></SubHeading>
                </div>
            </div>
                <BookingContent></BookingContent>
        </>
    )
}

export default BookingBlock

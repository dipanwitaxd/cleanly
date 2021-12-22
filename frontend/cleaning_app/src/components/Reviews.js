import React from 'react'
import Heading from './Heading'
import ReviewsContent from './ReviewsContent';
import SubHeading from './SubHeading';

function Reviews() {
    const text = "Don't take our ";
    const bluetext="word";
    const subheading = "Read what our past customers said about our cleaning and services.";
    return (
        <div className="row">
            <Heading text={text} bluetext={bluetext}></Heading>
            <SubHeading subheading={subheading}></SubHeading>
            <ReviewsContent></ReviewsContent>
        </div>
    )
}

export default Reviews

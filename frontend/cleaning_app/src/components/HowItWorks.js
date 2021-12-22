import React from 'react'
import Heading from './Heading'
import HIWContent from './HIWContent';
import SubHeading from './SubHeading';

function HowItWorks() {
    const text= "How it ";
    const bluetext="works";
    const subheading = "We’ve made all the hardwork for making it simple for you. Here’s how it works";
    return (
        <div className="row">
            <Heading text={text} bluetext={bluetext}></Heading>
            <SubHeading subheading={subheading}></SubHeading>
            <HIWContent></HIWContent>
        </div>
    )
}

export default HowItWorks

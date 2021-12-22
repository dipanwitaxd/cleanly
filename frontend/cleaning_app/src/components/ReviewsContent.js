import React, { Component } from 'react'

class ReviewsContent extends Component {

    constructor(props) {
        super(props);
        this.state = {
            items: [],
            isLoaded: false,
        }
    }
    componentDidMount() {

        fetch('http://localhost:8080/testimonials')
            .then(res => res.json())
            .then(json => {
                this.setState({
                    isLoaded: true,
                    items: json,
                })
            });
    }
    render() {

        var { isLoaded,items } = this.state;

        if(!isLoaded) {
            return(
                <div></div>
            );
        }
        else {
            return(
                <div className="row mt-5">
                    {items.map(item => (
                        <div className="col-md-4" key={item.testimonial_id}>
                        <div className="testi-block">
                            <i className="fa fa-quote-left" aria-hidden="true"></i>
                            <p>{item.testimonial_message}</p>
                        </div>
                        <div className="testi-title">
                            <h4>{item.testimonial_user}</h4>
                            <p>{item.testimonial_user_designation},{item.testimonial_user_city}</p>
                        </div>
                    </div>
                    ))}
                </div>
            );
        }
    }
}
export default ReviewsContent;

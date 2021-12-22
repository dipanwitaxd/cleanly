import React from 'react'

function Heading({text, bluetext}) {
    return (
        <div className="col-md-12">
            <h2>
                {text}
                <span>{bluetext}</span>
            </h2>
               
        </div>
    )
}

export default Heading

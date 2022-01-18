import React from 'react';

export default class TodoList extends React.Component {
    state = {
        value: '',
        counter: 0,
        items: [],
    }

    handleInputChange = (e) => {
        this.setState({value: e.target.value});
    }

    addItem = () => {
        if(this.state.value !== "") {
            this.setState({counter: this.state.counter + 1})
            let newItem = {
                id: this.state.counter,
                text: this.state.value,
                completed: false,
            };

            this.setState((prevState) => {
                return {
                    items: prevState.items.concat(newItem)
                };
            });

            this.setState({value: ""});
        }
    }

    toggleCompletion = (e) => {
        this.setState({
            item: this.state.items[e.target.id].completed = this.state.items[e.target.id].completed ? false : true
        })
    }

    render() {
        return (
            <div style={{margin: '50px'}}>
                <div>
                    <input type="text" value={this.state.value} onChange={this.handleInputChange}/>
                    <button style={{marginLeft: "5px"}} type="submit" onClick={this.addItem}>Add</button>
                </div>
                <div>
                    <p className="task-counter">{this.state.items.filter((item) => !item.completed).length} remaining out of {this.state.items.length} tasks</p>
                </div>
                <div>
                    {this.state.items.length > 0 && (
                        <ul>
                            {this.state.items.map((item) => {
                                return (
                                    <li className={item.completed ? "is-done" : ""} key={item.id} id={item.id}
                                        onClick={this.toggleCompletion}>{item.text}</li>
                                )
                            })}
                        </ul>
                    )}
                </div>
                <style>{`
                    .is-done {
                        text-decoration: line-through;
                    }
                `}</style>
            </div>
        );
    }
}

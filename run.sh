#!/bin/bash

if [ ! -n "$1" ]
then
	echo "Usage: `basename $0` [bfs|dfs]";
	exit 0;
fi

if [ "bfs" != "$1" -a "dfs" != "$1" ]
then
	echo "Arguments are: 'bfs' or 'dfs'";
	echo "Usage: `basename $0` [bfs|dfs]";
	exit 0;
fi

java -jar "dist/Strategy.jar" $1


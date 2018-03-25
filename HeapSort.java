package com.ricky;

public class HeapSort {

	
	public static void heapSort(int[] arr){
		int switchValue;
		BuildMaxHeap(arr);
		for(int i=arr.length;i>1;i--){
			switchValue=arr[i-1];
			arr[i-1]=arr[0];
			arr[0]=switchValue;
			MaxHeapMaintance(arr, 1,i-1);
		}
	}
	
	
	public static void BuildMaxHeap(int[] arr){
		for(int i=arr.length/2;i>0;i--){
			MaxHeapMaintance(arr, i,arr.length);
		}
	}
	
	
	public static void MaxHeapMaintance(int[] arr,int node,int length){
		if(node<1){
			return;
		}
		int leftNode=2*node;
		int rightNode=2*node+1;
		int maxNode=node;
		int switchValue;
		if(leftNode<=length&&arr[leftNode-1]>arr[node-1]){
			maxNode=leftNode;
		}
		if(rightNode<=length&&arr[rightNode-1]>arr[maxNode-1]){
			maxNode=rightNode;
		}
		if(maxNode!=node){
			switchValue=arr[maxNode-1];
			arr[maxNode-1]=arr[node-1];
			arr[node-1]=switchValue;
			MaxHeapMaintance(arr, maxNode,length);
		}
		
	}
}

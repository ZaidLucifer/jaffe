import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComplaintViewComponent } from './complaint-view.component';

describe('ComplaintViewComponent', () => {
  let component: ComplaintViewComponent;
  let fixture: ComponentFixture<ComplaintViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComplaintViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComplaintViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

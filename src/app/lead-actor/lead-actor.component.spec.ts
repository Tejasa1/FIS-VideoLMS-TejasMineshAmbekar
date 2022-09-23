import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LeadActorComponent } from './lead-actor.component';

describe('LeadActorComponent', () => {
  let component: LeadActorComponent;
  let fixture: ComponentFixture<LeadActorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LeadActorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LeadActorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

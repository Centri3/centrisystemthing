Planet	"End/Lercurnis A I"
{
	ParentBody     "Fragmunt"
	Class          "Aquaria"
	Mass            15
	Radius          2e+04
	InertiaMoment   0.334
	Oblateness      0.00235
	RotationPeriod  1.19e+04
	RotationOffset  145
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_fragmunt_end.cfg"
		SurfStyle       0.506
		Randomize      (-0.968, 0.341, 0.495)
		colorDistMagn   0.0454
		colorDistFreq   932
		detailScale     256
		drivenDarkening 1
		seaLevel        0.511
		snowLevel       2
		tropicLatitude  0.878
		icecapLatitude  1.02
		icecapHeight    0
		climatePole     0.573
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.214
		heightTempGrad  0.625
		beachWidth      0.00104
		tropicWidth     0.07
		mainFreq        2.03
		venusFreq       1.02
		venusMagn       0.878
		mareFreq        0.4
		mareDensity     0.351
		terraceProb     0.512
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0352
		dunesFreq       81
		dunesFraction   0.619
		hillsMagn       2
		hillsFreq       35
		hillsFraction   1
		hills2Fraction  1
		riversMagn      100
		riversFreq      10
		riversSin       10
		riftsMagn       0
		riftsFreq       2.3
		riftsSin        6.08
		canyonsMagn     0.395
		canyonsFreq     2.86
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.036
		volcanoMagn     0.682
		volcanoFreq     0.551
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.0376
		volcanoRadius   0.494
		volcanoTemp     389
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     2.72
		cycloneFreq     0.583
		cycloneDensity  0.432
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		SpotBrightCB    2.5
		SpotWidthCB     0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          25
		Velocity        203
		BumpHeight      2.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  0.1
		Opacity         0.397
		mainFreq        0.298
		mainOctaves     15
		Coverage        1
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          25
		Velocity        136
		BumpHeight      3.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateBright  0.104
		Opacity         0.382
		mainFreq        0.298
		mainOctaves     15
		Coverage        1
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          25
		Velocity        177
		BumpHeight      4.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateBright  0.1
		Opacity         0.473
		mainFreq        0.298
		mainOctaves     15
		Coverage        1
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Fragmunt End"
		Height          200
		Density         7.34e-11
		Pressure        1e-09
		Greenhouse      0.0434
		Bright          3
		Opacity         1
		SkyLight        0.527
		Hue             -0.00938
		Saturation      0.819

		Composition
		{
			He        	54.3
			Ne        	24.2
			CH4       	13.2
			N2        	8.21
			Ar        	0.0106
			CO        	0.00185
			O2        	0.000396
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          1.35959586
		SemiMajorAxis   1.1
		Eccentricity    0
		Inclination     0
		AscendingNode   -63.2061069
		ArgOfPericenter 2.7480916
		MeanAnomaly     211.603053
	}
}


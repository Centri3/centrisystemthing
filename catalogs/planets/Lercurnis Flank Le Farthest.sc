DwarfMoon	"Le Farthest/Lercurnis III XIII"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            8.62e-06
	Radius          150
	InertiaMoment   0.4
	RotationPeriod  176
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.793 0.714 0.548)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.99
		Randomize      (-0.784, -0.275, 0.770)
		colorDistMagn   0.0856
		colorDistFreq   18.2
		detailScale     512
		drivenDarkening 0.0196
		seaLevel        0.184
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  0.708
		icecapHeight    0.0965
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28
		heightTempGrad  0.625
		beachWidth      0.00121
		tropicWidth     0.07
		mainFreq        1.98
		venusFreq       1
		venusMagn       0
		mareFreq        0
		mareDensity     0.131
		terraceProb     0.291
		erosion         0
		montesMagn      0.0494
		montesFreq      7.09
		montesSpiky     0.946
		montesFraction  0.145
		dunesMagn       0.0388
		dunesFreq       1.37
		dunesFraction   0.143
		hillsMagn       0.122
		hillsFreq       19.2
		hillsFraction   0.11
		hills2Fraction  0.275
		riversMagn      0
		riversFreq      2.52
		riversSin       4.81
		riftsMagn       0
		riftsFreq       3.88
		riftsSin        8.07
		canyonsMagn     0.482
		canyonsFreq     0.0608
		canyonsFraction 0
		cracksMagn      0.0531
		cracksFreq      0.0531
		cracksOctaves   0
		craterMagn      1.71
		craterFreq      0.439
		craterDensity   0.875
		craterOctaves   15
		craterRayedFactor 0.214
		volcanoMagn     0.178
		volcanoFreq     0.654
		volcanoDensity  0.165
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.298
		volcanoRadius   0.14
		volcanoTemp     141
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.5
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		PeriodDays      19742.6463
		SemiMajorAxisKm 61764877.7
		Eccentricity    0.0763358779
		Inclination     -184.122137
		AscendingNode   -123.664122
		ArgOfPericenter -140.152672
		MeanAnomaly     118.167939
	}
}

